package sa.com.stc.vms.backend.models;

import sa.com.stc.common.models.BaseModel;
import sa.com.stc.vms.backend.dtos.PlateSettingPostUpdateDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class PlateSetting extends BaseModel {
    @Column
    private String alternatives;
    @Column
    private Character arabicChar;
    @Column
    private Character englishChar;

    public PlateSetting() {
    }

    public PlateSetting(UUID id) {
        super(id);
    }

    public PlateSetting(PlateSettingPostUpdateDto dto) {
        super(UUID.randomUUID());
        this.alternatives = dto.getAlternatives();
        this.arabicChar = dto.getArabicChar();
        this.englishChar = dto.getEnglishChar();
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
