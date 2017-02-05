package school

import com.school.SearchRequest
import grails.converters.JSON

class SchoolController {

    SearchRequest searchRequest;
    def reportService;

    def index() {
//        def data = report()
//        render data as JSON
        String serviceName = params.get("service")+"Service";
        println "serviceName = $serviceName"
        def service = applicationContext.getBean(serviceName);
        def data = service.getData(params);
        render data as JSON
    }

    def report() {
        setParams()
        return reportService.getResults(searchRequest)
    }

    def setParams(){
        searchRequest = new SearchRequest(requestParameters: new HashMap<String, String>())
        searchRequest.requestParameters.putAll(params)
    }
}
