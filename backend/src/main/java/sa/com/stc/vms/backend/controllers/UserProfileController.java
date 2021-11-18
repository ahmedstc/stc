package sa.com.stc.vms.backend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.UserProfileDto;
import sa.com.stc.vms.backend.dtos.UserProfilePostUpdateDto;
import sa.com.stc.vms.backend.filters.UserProfileFilter;
import sa.com.stc.vms.backend.models.UserProfile;
import sa.com.stc.vms.backend.services.IUserProfileService;

@RestController
@RequestMapping("/api/user-profile")
public class UserProfileController extends
        BaseCRUDCustomController<UserProfile, UserProfileDto, UserProfilePostUpdateDto, UserProfilePostUpdateDto, UserProfileFilter, IUserProfileService> {

    public UserProfileController(IUserProfileService service) {
        super(service);
    }

    @Override
    public UserProfileDto MapModelToModelDto(UserProfile model) {
        return new UserProfileDto(model);
    }

    @Override
    public UserProfile MapPostDtoToModel(UserProfilePostUpdateDto userProfilePostUpdateDto) {
        return new UserProfile(userProfilePostUpdateDto);
    }

    @Override
    public UserProfile MapUpdateDtoToModel(UserProfilePostUpdateDto userProfilePostUpdateDto) {
        return new UserProfile(userProfilePostUpdateDto);
    }
}
