package schoolreport

import com.school.SearchRequest
import grails.converters.JSON

class ReportController {

    def resultService
    SearchRequest searchRequest;

    def index() {
        setParams()
        def data = resultService.getResults(searchRequest)
        render data as JSON
    }

    def setParams(){
        searchRequest = new SearchRequest(requestParameters: new HashMap<String, String>())
        searchRequest.requestParameters.putAll(params)
    }
}
