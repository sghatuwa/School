package schoolreport

import com.school.SearchRequest
import grails.transaction.Transactional
import org.codehaus.groovy.grails.web.json.JSONObject

@Transactional
class ReportService {

    SearchRequest searchRequest;

    def getResults(SearchRequest searchRequest)  {
        println "In Report Service ::"
        println "searchRequest.requestParameters.keySet() = "+searchRequest.requestParameters.keySet()
        return searchRequest.requestParameters as JSONObject
    }

    def getData(Map params){
        println "In Report Service ::"
        setParams(params)
        println "searchRequest.requestParameters.keySet() = "+searchRequest.requestParameters.keySet()
        return searchRequest.requestParameters as JSONObject
    }

    def setParams(params){
        searchRequest = new SearchRequest(requestParameters: new HashMap<String, Object>())
        searchRequest.requestParameters.putAll(params)
    }
}
