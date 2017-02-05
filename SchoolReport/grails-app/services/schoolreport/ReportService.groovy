package schoolreport

import com.school.SearchRequest
import grails.transaction.Transactional
import org.codehaus.groovy.grails.web.json.JSONObject

@Transactional
class ReportService {

    def getResults(SearchRequest searchRequest)  {
        println "In Report Service ::"
        println "searchRequest.requestParameters.keySet() = "+searchRequest.requestParameters.keySet()
        return searchRequest.requestParameters as JSONObject
    }
}
