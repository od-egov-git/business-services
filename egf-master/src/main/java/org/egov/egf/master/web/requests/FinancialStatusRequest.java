package  org.egov.egf.master.web.requests;
import java.util.ArrayList;
import java.util.List;

import org.egov.common.contract.request.RequestInfo;
import org.egov.egf.master.web.contract.FinancialStatusContract;

import lombok.Data;
public @Data class FinancialStatusRequest {
private RequestInfo requestInfo = new RequestInfo();
private List<FinancialStatusContract> financialStatuses =new ArrayList<FinancialStatusContract>() ;
}