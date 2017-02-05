package schoolreport

import com.school.SearchRequest
import grails.converters.JSON
import grails.transaction.Transactional
import org.codehaus.groovy.grails.web.json.JSONObject

@Transactional
class ResultService {

    def getResults(SearchRequest searchRequest)  {
        println "In Result Service :: "
        println "searchRequest.requestParameters.keySet() = "+searchRequest.requestParameters.keySet()
        return searchRequest.requestParameters as JSONObject
    }
}
