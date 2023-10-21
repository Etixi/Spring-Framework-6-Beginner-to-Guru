## **Introduction au framework Spring**

### **À propos du framework Spring**
+ `Spring Framework` est le framework Java le plus populaire pour créer des applications d'entreprise
+ Enterprise Grade étant des applications hautement évolutives et fiables
    + Plus de 60% des entreprises utilisant Java utilisent Spring
+ Très populaire auprès des banques, des institutions financières et de la grande distribution
+ Peut être utilisé pour les applications monolithiques traditionnelles
+ Bien adapté aux architectures modernes basées sur des microservices
+ Couramment utilisé comme technologie **«backend»**
+ 
### **Introduction au framework Spring**
+ Introduit par Rod Johnson en 2003
  + Commencé comme une alternative plus simple à J2EE
  + Livre rédigé par Rod intitulé «Expert One on One J2EE sans EJB»
  + EJB - Enterprise Java Beans, alias « XML Hell »
  + L'accent était mis sur l'utilisation des POJO pour simplifier le développement
+ Sortie de Spring Framework 1.0 en mars 2004
  + Rapidement adopté par la communauté Java

### **Historique du framework Spring**
+ 2007 Spring Framework 2.5 publié avec une configuration basée sur les annotations
+ Août 2009 Spring Source acheté par VMWare pour 420 millions de dollars
+ Décembre 2009 Spring 3.0 publié avec une configuration basée sur Java
+ Avril 2013 - VMware crée une nouvelle société, Pivotal. Toutes les applications Spring ont été déplacées vers cette société
  + Avril 2014 - Sortie de Spring Boot 1.0
+ Juillet 2017 - Sortie de Spring Framework 5, introduction de la programmation réactive
+ Novembre 2017 - Sortie de Spring Boot 2.0

### **Historique du framework Spring**
+ Automne 2022 - Sortie de Spring Framework 6.0
  + Nécessite Java 17+
  + Spring Framework 5.x prend en charge Java 8 - Java 17
+ Automne 2022 - Sortie de Spring Boot 3.0

### **Spring Framework contre Spring Boot**
+ `Spring Framework` est une collection de bibliothèques de framework
  + Injection de dépendances, Web, gestion des transactions, etc.
+ `Spring Boot` est un outil automatisé pour les applications `Spring Framework`
  + Considérez-le comme un emballage autour de « Spring »
  + Vous pouvez utiliser `Spring Framework sans Spring Boot`
  + Mais vous ne pouvez pas utiliser `Spring Boot sans Spring Framework`

<img src="https://i.pinimg.com/736x/96/ab/74/96ab74ad50090d1214ff31c7315bf2af.jpg"/>

### **Fonctionnalités de Spring Boot**
+ Dépendances «de démarrage» organisées pour les composants communs
+ «Configuration automatique» judicieuse basée sur les classes trouvées sur le chemin de classe
  + Par exemple, configurera automatiquement une base de données en mémoire si H2 se trouve sur le chemin de classe
+ Configuration externalisée via fichiers et variables d'environnement
+ Configuration automatique de la journalisation
  + Mesures de performances
+ Points de terminaison du bilan de santé
+ Informations améliorées sur les pannes

### **Projets Spring**
+ `Spring Data` - Collection de projets pour la persistance des données dans des bases de données SQL et NoSQL
+ `Spring Cloud` - Outils pour systèmes distribués
+ `Spring Security` - Authentification et autorisation
+ `Spring Session` - Sessions d'applications Web distribuées
+ `Spring Integration` - Modèles d'intégration d'entreprise
+ `Spring Batch` - Traitement par lots
+ `Spring State Machine` - Machine à états open source

## **Présentation de l'application Web Spring**

+ Application Web
+ Le navigateur communique via HTTP sur le port `8080`.
+ La valeur par défaut normale est `80`.
+ Le serveur Tomcat écoute les requêtes sur le port `8080`.
+ Tomcat achemine les requêtes vers l'application Spring Boot
 + Spring Boot répond avec HTML via HTTP


## **Présentation de Spring MVC**
### **Qu'est-ce que MVC?**
+ `MVC` est un modèle de conception courant pour les interfaces graphiques et les applications Web
  + Utilisé dans de nombreux langages de programmation
+ `M` - Modèle
+ `V` - Vue
+ `C` - Contrôleur

### **Printemps MVC**
+ `MODEL` - Simple `POJO` avec une collection de propriétés qui peuvent ou non être utilisées par la vue
+ `VIEW` - Données demandées par le client. Implémenté avec `JSP, Thymeleaf, Jackson, etc. Peut être HTML, JSON, XML, texte, etc`.
+ `CONTROLLER` - Classe Java implémentée pour gérer le mappage des requêtes. Doit être un « agent de la circulation » et contenir un minimum de logique métier. Fonctionne généralement en conjonction avec un service contenant une logique métier.

<img src = "https://cdn.educba.com/academy/wp-content/uploads/2019/04/what-is-mvc-design-pattern.jpg"/>






