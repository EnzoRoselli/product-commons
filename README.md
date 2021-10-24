# My-market (product-commons)

You need to install the product common library to be able to run the following MyMarket microservices:
- product-service: https://github.com/EnzoRoselli/product-service
- offer-service: https://github.com/EnzoRoselli/offer-service

## How to Use :pencil:

- Clone project
- Run command: ```mvn install```

That's all, you are ready to go. With the command the library is installed in your .m2 local repository, and the product and offer service will be able to use it as a dependency.

## Branching (GitFlow) :sparkler:

- Feature_MigrateToPhone: Local/remote branch for a feature. After merge it in develop, delete it.
- Develop: Stores all completed features that haven’t yet been released
- Master: Stores the finished releases
 
---
By Facundo Mateu, Enzo Roselli, and Matias Nicoletti
