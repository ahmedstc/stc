package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.vms.backend.models.PlateSetting;

import java.util.UUID;

public class PlateSettingDto extends BaseModelDto {
    private String alternatives;
    private Character arabicChar;
    private Character englishChar;

    public PlateSettingDto() {
    }

    public PlateSettingDto(UUID id) {
        super(id);
    }

    public PlateSettingDto(PlateSetting model) {
        super(model);
        this.alternatives = model.getAlternatives();
        this.arabicChar = model.getArabicChar();
        this.englishChar = model.getEnglishChar();
    }

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
