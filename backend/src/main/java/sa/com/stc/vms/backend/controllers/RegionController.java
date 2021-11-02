package sa.com.stc.vms.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.com.stc.common.controllers.BaseCRUDCustomController;
import sa.com.stc.vms.backend.dtos.RegionDto;
import sa.com.stc.vms.backend.dtos.RegionPostUpdateDto;
import sa.com.stc.vms.backend.filters.RegionFilter;
import sa.com.stc.vms.backend.models.Region;
import sa.com.stc.vms.backend.services.IRegionService;

@RestController
@RequestMapping("/api/region")
public class RegionController extends
        BaseCRUDCustomController<Region, RegionDto, RegionPostUpdateDto, RegionPostUpdateDto, RegionFilter, IRegionService> {

    @Autowired
    IRegionService iRegionService;

    public RegionController(IRegionService service) {
        super(service);
    }

    @Override
    public RegionDto MapModelToModelDto(Region model) {
        return new RegionDto(model);
    }

    @Override
    public Region MapPostDtoToModel(RegionPostUpdateDto regionPostUpdateDto) {
        return new Region(regionPostUpdateDto);
    }

    @Override
    public Region MapUpdateDtoToModel(RegionPostUpdateDto regionPostUpdateDto) {
        return new Region(regionPostUpdateDto);
    }
}
