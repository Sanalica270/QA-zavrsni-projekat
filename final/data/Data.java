package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	public static String excellPath = "src\\data.xlsx";
	public static String file = "data.xlsx";
	public static String sheetName = "data";
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	private static XSSFRow r;
	private static XSSFCell cell;

	public static boolean getFile(String path) {

		if (wb != null) {
			try {
				wb.close();
			} catch (Exception e) {
				System.out.println(e.toString());
				return false;
			}
		}
		File f = new File(path);

		try {

			FileInputStream fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);
			excellPath = path;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lose otvaranje fajla!");
			return false;
		}
	}

	public static boolean getSheet(int index) {
		try {
			sheet = wb.getSheetAt(index);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lose otvaranje worksheeta!");
			return false;
		}
	}

	public static String getDataAt(int row, int col) {

		try {

			cell = sheet.getRow(row).getCell(col);
			DecimalFormat df = new DecimalFormat("0");

			if (cell.getCellType() == CellType.NUMERIC) {
				return df.format(cell.getNumericCellValue());
			}
			return cell.toString();
		} catch (NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("Nesto je null!");
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Doslo je do greske!");
		}
		return "";
	}

	public static boolean setDataAt(int row, int col, String data) {

		try (FileOutputStream fos = new FileOutputStream(file)) {
			r = sheet.getRow(row);
			if (r == null) {
				r = sheet.createRow(row);
			}
			cell = r.getCell(col);
			if (cell == null) {
				cell = r.createCell(col);
			}
			cell.setCellValue(data);

			wb.write(fos);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Doslo je do greske!");
			return false;
		}
	}

	public static int rowNumber() {
		try {
			return sheet.getLastRowNum() + 1;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Doslo je do greske!");
			return -1;
		}
	}

	public static boolean closeFile() {

		if (wb != null) {
			try {
				wb.close();
				wb = null;
				return true;
			} catch (IOException e) {
				e.printStackTrace();
				wb = null;
				return false;
			}
		}
		return true;
	}

}
