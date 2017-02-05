package school

class ProxyFilters {

    def dependsOn = [ParamsFilters.class]
    def filters = {
        all(controller:'*', action:'*') {
            before = {
                println "In Proxy Filters"
            }
        }
    }
}
