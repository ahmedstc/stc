package sa.com.stc.vms.backend.dtos;

import sa.com.stc.common.models.BaseModelDto;
import sa.com.stc.vms.backend.models.UserProfile;

import java.util.UUID;

public class UserProfileDto extends BaseModelDto {
    private String nameAr;
    private String nameEn;


    public UserProfileDto() {
    }

    public UserProfileDto(UUID id) {
        super(id);
    }

    public UserProfileDto(UserProfile model) {
        super(model);
        this.nameAr = model.getNameAr();
        this.nameEn = model.getNameEn();
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

}
