package domaci_zadaci.klase.pozoriste;

public class Reditelj extends Zaposleni{
    /*
     * Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik
     * je nadimak_ime[naziv_pozorista].
     */

    private String nickname;

    public Reditelj(String fullName, Pozoriste theatre, String nickname) {
        super(fullName, theatre);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(nickname).append("_").append(super.toString()).toString();
    }
}
