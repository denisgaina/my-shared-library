def call(Map config) {   
    try {
        def status = bat returnStatus: true, script: "${config.nugetPath} push ${config.packagePath} ${config.nexusKey} -source ${config.source}"
        if ( status != 0 ){
            error("Nuget push of ${config.packagePath} failed")
        }
    } catch (err) {
        error("Nuget push of ${config.packagePath} failed ${err}")
    }
}
