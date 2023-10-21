
## **Obtenir de l'aide avec Spring**
### **Première étape - Dépannage**
+ Essayez d'abord de déterminer la cause première
+ Lisez la trace de la pile dans la console et recherchez un message d'erreur.
+ Souvent, le message d'erreur signifie exactement ce qu'il dit
+ C'est-à-dire - fichier introuvable - Le fichier n'est pas trouvé là où le programme recherche
+ Chemin erroné, problème d'autorisations?, faute de frappe dans le nom du fichier ?
+ Cela me dérange souvent aussi lorsque je ne comprends pas le sens du message.

### **Première étape - Dépannage - Suite.**
+ Changez UNE chose à la fois, testez à nouveau
+ Vous empêche de réparer une chose tout en en cassant une autre!
+ Avec plusieurs modifications, vous pourriez masquer le correctif en introduisant une autre erreur.
+ Utilisez le débogueur
+ Le cas échéant, définissez un point d'arrêt et inspectez le code pour voir ce qui se passe.
+ Si l'erreur concerne une bibliothèque tierce, utilisez l'EDI pour télécharger les sources et lire le JavaDoc.

### **Première étape - Dépannage - Suite.**
+ Il n'y a aucune honte à rechercher l'erreur sur Google!
+ Je fais ça tout le temps!!!
+ Vous n'êtes probablement PAS la première personne à rencontrer l'erreur
+ Les résultats de recherche vous donnent souvent la solution, ou du moins vous orientent dans la bonne direction.
+ Consultez les questions et réponses du cours pour la leçon.
+ Il y a de fortes chances qu'un autre étudiant ait rencontré le problème et que la solution se trouve dans les questions-réponses.

### **Signaler un problème**
+ Lorsque vous signalez un problème:
+ Décrivez l'erreur et fournissez des détails sur le message d'erreur.
+ Décrire les résultats attendus
+ Décrire comment reproduire l'erreur
+ Fournissez un lien vers votre référentiel GitHub avec le code défaillant

### **Exemple de signalement d'un problème**
+ Bonjour, je reçois une erreur de pointeur nul lors de l'enregistrement d'un produit.
+ Voici un lien vers un résumé avec la trace complète de la pile
+ Voici un lien vers mon dépôt GitHub
+ Exécutez le test « ProductService.saveNewProduct » pour reproduire

### **Choses à faire lorsque vous signalez un problème**
+ Soyez clair et précis sur le problème
+ Fournir les résultats attendus
+ Fournissez la trace de la pile, le cas échéant - créez un résumé!
+ Fournissez votre code source, pas seulement des extraits

### **Choses à NE PAS faire lorsque vous signalez un problème**
+ Ne soyez pas vague
 + ie « J'ai un problème, pouvez-vous m'aider. Voici mon GitHub… »
 + Sauf nécessité, ne prenez pas de captures d'écran du message d'erreur.
+ N'envoyez jamais de photo de l'écran de votre ordinateur: impossible à lire et généralement inutile.
+ Ne coupez pas et ne collez pas chaque fichier de classe que vous jugez pertinent. Utilisez GitHub pour éviter toute erreur.
reproduit
 + Les extraits de code sont acceptables lorsqu'ils sont pertinents.

### **Où demander de l'aide**
+ Pour les problèmes en cours:
 + Utilisez les questions-réponses du cours ou Slack.
 + Les deux sont surveillés par moi-même, mes assistants et d'autres étudiants
+ Pour Spring Framework en général:
 + Débordement de pile
 + GitHub respectif au projet Spring


## **Tirez le meilleur parti de votre cours!**

### **Conseil numéro un**
+ Prenez le temps de terminer le cours !
+ Beaucoup de gens ne commencent jamais
+ Beaucoup commencent, mais ne finissent jamais
  +Pour tirer le meilleur parti du cours, vous devez suivre le cours !!!
+ Conseil de pro - Planifiez du temps sur votre calendrier. Faites une rencontre pour vous-même !

### **GitHub**
+ Tous les exemples de code source du cours sont disponibles sur GitHub
+ Veuillez consulter l'annexe A si vous êtes nouveau sur GitHub
+ De nombreuses sections utiliseront des branches, notez les liens pour:
  + Branche de départ - État du code au début de la leçon
  + Branche de fin - État du code à la fin de la leçon
  + Vous pouvez comparer votre code à la branche de début ou de fin
  + Ou Comparez la branche de départ à la branche de fin pour voir ce qui a changé dans la leçon.

### **Flux de travail GitHub**
+ Flux de travail recommandé:
    + Dépôts Fork sur votre propre compte GitHub
    + Les comptes GitHub sont gratuits et les exemples sont parfaits à montrer aux futurs employeurs !
    + Suivez les leçons et complétez le codage
+ Comparez votre source aux branches de cours pour obtenir de l'aide!

### **Wiki du cours / FAQ**
+ Il existe un wiki de cours disponible sur GitHub
+ Voir les liens dans cette section du cours pour accéder
+ Vous trouverez :
 + Informations complémentaires liées au cours
 + Solutions aux questions et problèmes courants
 + FAQ générale sur le cours!
 + Mis à jour selon les besoins et en fonction de vos commentaires

### **Communauté Slack**
+ En tant qu'étudiant de ce cours, vous pouvez demander l'accès à Slack de Spring Framework Guru
Communauté
+ Obtenez votre accès à une chaîne Slack exclusive aux étudiants de ce cours
+ Obtenez de l'aide pour le cours, vos projets, partagez quelque chose de cool sur lequel vous travaillez
+ Ou dites simplement bonjour!
+ Voir le module dans la première section pour savoir comment adhérer!

### **Essai IntelliJ gratuit**
+ En tant qu'étudiant de ce cours, vous êtes éligible pour recevoir une licence d'essai IntelliJ Ultimate gratuite de 120 jours.
+ Un par personne (par email)
+ IntelliJ Ultimate n'est pas une exigence pour le cours.
+ Tout le code source est indépendant de l'IDE
+ IntelliJ est l'IDE Java n°1 utilisé par les entreprises.
+ Voir le module dans la première section pour obtenir des instructions sur la façon d'obtenir votre licence d'essai !

### **Bulletin SFG**
+ Les étudiants rejoignant la communauté Slack et/ou bénéficiant de l'essai gratuit d'IntelliJ seront inscrits à la newsletter Spring Framework Guru.
+ Plusieurs fois par semaine, vous recevrez un court e-mail sur le printemps, l'histoire du printemps, des articles de blog intéressants et des contes des tranchées !
+ En option, vous pouvez vous inscrire à ma newsletter depuis mon site Internet.

### **Résumé**
+ #1 – Faites le cours !
  + Fork GitHub et suivez des exemples de code
+ Rejoignez la communauté Slack! Collaborez avec d’autres gourous de Spring Framework !
+ Obtenez votre essai gratuit d'IntelliJ Ultimate

## **Configuration de votre environnement de développement**

### **Environnement de développement**
+ Tout système d'exploitation prenant en charge le développement Java - macOS, Windows ou Linux
+ 8 Go de RAM, 16 Go+ de préférence
+ Java 17 ou supérieur
+ Spring Framework 6 / Spring Boot 3 nécessitent Java 17+
+ Oracle Java ou OpenJDK
+ Doit avoir JDK installé

### **Outils de création**
+ Maven version 3.6.0 ou supérieure
  + Idéalement installé pour une utilisation en ligne de commande
+ Consultez la documentation Apache Maven pour votre système d'exploitation pour les instructions d'installation

### **Vérifiez votre environnement**
+ Vérifiez que Java est installé: `java -version`
+ Vérifiez que Java JDK est installé: `javac -version`
+ Vérifiez que Maven est installé: `mvn -v`

### **Intégration Git**
+ Tout le code source est dans GitHub
+ L'utilisation de GitHub est facultative pour ce cours
  + Le code source peut être téléchargé depuis GitHub sous forme de fichier zip
  + Voir l'annexe A si vous débutez dans l'utilisation de Git
  + Ce qui suit sera une vidéo pour le flux de travail recommandé avec GitHub

### **IDE - IntelliJ Ultimate**
+ IntelliJ Ultimate est utilisé dans le cours
+ Pas obligatoire
  + Tous les exemples de code source sont indépendants de l'IDE
  + Un essai gratuit de 120 jours est disponible pour les étudiants
  + Les options IDE gratuites incluent: IntelliJ Community Edition, STS, Eclipse et Netbeans
 
## **Utilisez Github**
+ GH Workflow
+ Forking Repos
+ Cloning Repos
+ Compare To Branch
+ Compare To Source



## Spring Framework 6: Wiki du cours débutant à gourou
Vous avez une question sur votre cours Spring Framework 6? [Consultez ces FAQ!](https://github.com/springframeworkguru/spring5webapp/wiki)

## Obtenir la configuration de votre environnement de développement
### Versions recommandées
| Recommandé | Référence                                                                                                                                                          | Remarques |
|------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------|
| Oracle Java 17 JDK | [Télécharger]([https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html])(https://www.oracle.com/java/technologies/downloads/#java17 ) | Java 17 ou supérieur est requis pour Spring Framework 6 |
| IntelliJ 2022 ou supérieur | [Télécharger](https://www.jetbrains.com/idea/download/)                                                                                                            | Édition ultime recommandée. Les étudiants peuvent obtenir une licence d'essai gratuite de 120 [ici](https://github.com/springframeworkguru/spring5webapp/wiki/Which-IDE-to-Use%3F#how-do-i-get-the-free-120- jour d'essai à intellij-ultimate) |
| Maven 3.8.0 ou supérieur | [Télécharger](https://maven.apache.org/download.cgi)                                                                                                               | [Instructions d'installation](https://maven.apache.org/install.html) |
| Gradle 7.6 ou supérieur | [Télécharger](https://gradle.org/install/)                                                                                                                         | **Remarque:** Utilisez la version 5 ou supérieure si vous utilisez Java 11 |
| Git 2.39 ou supérieur | [Télécharger](https://git-scm.com/downloads)                                                                                                                       | |
| Clients Git GUI | [Téléchargements](https://git-scm.com/downloads/guis)                                                                                                              | Non requis. Mais peut être utile si vous êtes nouveau sur Git. SourceTree est une bonne option pour les utilisateurs Mac et Windows. |