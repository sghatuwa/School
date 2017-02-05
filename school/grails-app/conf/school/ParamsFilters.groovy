package school

class ParamsFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                println "request.contentLength = $request.contentLength"
                println "params.keySet() = $params.keySet()"
                println "Params Filter Started = "
                params.putAll(request.JSON as Map)
                println "params = $params"
                params.each { key, value ->
                    println "key: " + key + " = " + value.toString() + " : " + value.getClass()
                }
                println "Params Filter Ended = "
            }
        }
    }
}
