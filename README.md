# «Votre pharmacie »

# 1. Idée de départ et proposition : 
Développement d’une application de gestion de pharmacie.
# 2. Description 
En tant que clients, nous avons constaté que dans de nombreuses pharmacies, il n'est pas toujours possible de trouver les produits que nous recherchons. Cela peut être dû à leur indisponibilité, à leur rupture de stock ou au manque de visibilité de ces produit pour certains pharmaciens, ce qui nous oblige à perdre du temps en visitant plusieurs pharmacies pour continuer notre recherche ou à passer des commandes de ces produits et attendre leur réception.
Pour pallier à ces problèmes on propose de créer cette application qui va apporter une bonne stratégie d’organisation dans les pharmacies d’un coté et qui facilite la vie des clients au niveau des achats d’un autre coté.
 Le projet consiste à créer une application de gestion de pharmacie en Java, qui permet de gérer :
## La gestion des stocks :
le stock de la pharmacie (ajout, suppression et modification de produits) ce qui va assurer la disponibilité des produits et permet  aux clients de trouver leurs produits cherchés facilement.

## 	Visibilité sur la clientèle : (ajout, suppression et modification de clients). 

## Gestion des alertes :
l'application comprend également une fonctionnalité de notification lorsque la date de péremption des produits est proche, ainsi qu'une gestion automatique de réduction sur les produits cosmétiques.
# 3. La gestion du projet:
## l'idée de depart : 
## preapration de le premier powerpoint
## Premiere presentation du projet : 13/03/2023
##


# 4. Réalisation :
## 	Vue :
Classe Interface :
 représente l'interface graphique de l'application, contenant les deux boutons pour la gestion des clients et la gestion de la pharmacie. Cette classe aura des méthodes pour afficher la page correspondante lorsque l'utilisateur clique sur l'un des boutons.

##	Proposition de classes 

 ## A) Modèle:
###	Classe Produit : 
  représente un produit de la pharmacie, contenant les attributs tels que le nom, la quantité, le prix, la date de péremption, le fournisseur, etc. Cette classe aura des méthodes pour ajouter, supprimer et modifier un produit, ainsi qu'une méthode pour vérifier si la date de péremption est proche ou atteinte.
###	Classe Client : représente un client de la pharmacie, contenant les attributs tels que le nom, l'adresse, le numéro de téléphone, la date de naissance, numéro de sécurité sociale , etc. Cette classe aura des méthodes pour ajouter, supprimer et modifier un client (les mises à jour).
###	Classe Stock : représente le stock de la pharmacie, contenant une liste de produits. Cette classe aura des méthodes pour ajouter, supprimer et modifier un produit dans le stock, ainsi que pour vérifier si la date de péremption est proche.
###	Classe Notification : représente la notification qui sera envoyée lorsque la date de péremption est proche. Cette classe aura des méthodes pour envoyer la notification.
•	Renouveler le stock : Ce qui permet de renouveler les stocks avant sa fin.
## B) Contrôleur:
###	Classe Contrôleur : représente le contrôleur de l'application, qui coordonne l'interaction entre la vue et le modèle. Cette classe aura des méthodes pour gérer les actions de l'utilisateur (cliquer sur un bouton, ajouter un produit, supprimer un client, etc.) et mettre à jour la vue en conséquence.
# 4. Conclusion 
 Le modèle MVC est utilisé pour organiser le code de l'application de manière claire et efficace. Les classes du modèle représentent les données de l'application, la vue représente l'interface graphique et le contrôleur gère la logique métier et l'interaction entre la vue et le modèle.


