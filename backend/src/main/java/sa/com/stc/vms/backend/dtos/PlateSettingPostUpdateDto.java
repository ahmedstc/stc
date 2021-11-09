package sa.com.stc.vms.backend.dtos;

public class PlateSettingPostUpdateDto {
    private String alternatives;
    private Character arabicChar;
    private Character englishChar;

    public String getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(String alternatives) {
        this.alternatives = alternatives;
    }

    public Character getArabicChar() {
        return arabicChar;
    }

    public void setArabicChar(Character arabicChar) {
        this.arabicChar = arabicChar;
    }

    public Character getEnglishChar() {
        return englishChar;
    }

    public void setEnglishChar(Character englishChar) {
        this.englishChar = englishChar;
    }
}
