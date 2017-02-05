package school

class ProxyFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                println "In Proxy Filters"
            }
        }
    }
}
