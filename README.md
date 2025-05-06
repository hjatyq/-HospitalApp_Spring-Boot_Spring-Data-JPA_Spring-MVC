# 🏥 HospitalApp

**HospitalApp** est une application web développée avec **Spring Boot**, qui permet de gérer des patients en utilisant **Spring MVC** pour le web et **Spring Data JPA** pour l'accès aux données. Les informations sont stockées dans une base de données **MySQL**.

## 📌 Fonctionnalités

- Ajouter, modifier et supprimer des patients
- Lister les patients avec pagination
- Rechercher un patient par nom
- Intégration Spring Boot (MVC + Data JPA)
- Interface simple en HTML/Thymeleaf

## 🛠️ Technologies utilisées

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- MySQL
- Maven

## 💾 Configuration

### 1. Prérequis

- Java JDK installé
- Maven installé
- MySQL en local
- IDE recommandé : IntelliJ ou Eclipse

### 2. Créer la base de données

Avant de démarrer l'application, crée la base de données dans MySQL :

```sql
CREATE DATABASE `patients-db`;
