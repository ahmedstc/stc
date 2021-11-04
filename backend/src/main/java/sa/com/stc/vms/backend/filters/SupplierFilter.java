package sa.com.stc.vms.backend.filters;

import sa.com.stc.common.filters.BaseFilter;

public class SupplierFilter extends BaseFilter {
    private String nameAR;
    private String nameEN;

    public String getNameAR() {
        return nameAR;
    }

    public void setNameAR(String nameAR) {
        this.nameAR = nameAR;
    }

    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }
}
