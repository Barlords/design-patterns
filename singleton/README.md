# 🧩 Design Pattern : Singleton

## 🔍 Qu'est-ce que le pattern Singleton ?

Le **Singleton** est un design pattern de création qui garantit qu'une classe n'a qu'une seule instance et fournit un point d'accès global à cette instance.

### 📌 Objectifs :
- Limiter la création d'instances d'une classe à **une seule**.
- Fournir un accès global à cette instance unique.

### 📜 Cas d'utilisation :
- Gestion de **ressources uniques** (ex. : fichiers de configuration, connexion à une base de données).
- Gestion d'un **registre global** ou d'un **cache partagé**.

### 📋 Diagramme UML du Singleton :
```plaintext
┌─────────────────────┐
│      Singleton      │
├─────────────────────┤
│ - instance          │
│ + getInstance()     │
├─────────────────────┤
│ + ...               │
└─────────────────────┘
```

## 🧑‍💻 Exercice : Implémenter le pattern Singleton

### 🔧 Scénario

Tu es chargé de développer un gestionnaire de configuration pour une application.
Ce gestionnaire doit garantir que :
- Une seule instance de configuration est créée.
- Cette instance peut être utilisée partout dans l'application.

### ✅ Objectifs de l'exercice :
- Crée une classe `ConfigurationManager` qui suit le pattern **Singleton**.
