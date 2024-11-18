# 🧩 Design Pattern : Strategy

## 🔍 Qu'est-ce que le pattern Strategy ?

Le **Strategy** est un design pattern comportemental qui permet de définir une famille d'algorithmes, de les encapsuler chacun dans une classe séparée, et de rendre leurs objets interchangeables.

### 📌 Objectifs :
- Séparer la logique métier de l'algorithme utilisé.
- Permettre de choisir dynamiquement une stratégie au moment de l'exécution.
- Faciliter l'ajout de nouvelles stratégies sans modifier le code existant.

### 📜 Cas d'utilisation :
- Lorsqu'une classe doit supporter plusieurs variantes d'un comportement (ex. : différents modes de paiement, algorithmes de tri, etc.).
- Pour éviter de grandes structures conditionnelles (`if` / `switch`) en déléguant le comportement à une classe spécifique.

### 📋 Diagramme UML du Strategy :
```plaintext
┌───────────────────┐      ┌─────────────────────┐
│      Context      │      │     Strategy        │
├───────────────────┤      ├─────────────────────┤
│ - strategy: S     │◀─────│ + execute()         │
│ + setStrategy(S)  │      └─────────────────────┘
│ + execute()       │               ▲
└───────────────────┘               │
                                    │
     ┌──────────────────────────────┴──────────────┐
     │                                             │
┌───────────────────┐                     ┌───────────────────┐
│ ConcreteStrategyA │                     │ ConcreteStrategyB │
└───────────────────┘                     └───────────────────┘
```



## 🧑‍💻 Exercice : Implémenter le pattern Strategy

### 🔧 Scénario
Tu travailles sur une application de gestion de panier d'achat. Actuellement, la classe ShoppingCart calcule :
- Le total des produits en appliquant une taxe.
- Le total dans différentes devises. 

Cependant, ces calculs sont codés en dur, ce qui rend difficile l'ajout ou la modification des règles de calcul (par exemple, si une nouvelle devise ou une logique fiscale change).

Ton objectif est de refactoriser ce code en utilisant le pattern **Strategy** pour :
- Remplacer la logique de la méthode `calculateTotal()` par une stratégie configurable de calcul des taxes.
- Remplacer la logique de la méthode `calculateTotalWithCurrency()` par une stratégie configurable de conversion de devises.

### ✅ Objectifs de l'exercice :

#### 1 - Créer une stratégie pour le calcul des taxes :
- Crée une interface `TaxCalculationStrategy` avec une méthode `double calculateTax(double total)`.
- Implémente plusieurs stratégies de calcul des taxes :

  - `StandardTaxStrategy` : Applique un taux de taxe standard.
  - `ReducedTaxStrategy` : Applique un taux de taxe réduit.
  - `NoTaxStrategy` : N'applique aucune taxe.

#### 2 - Créer une stratégie pour la conversion des devises :
- Crée une interface `CurrencyConversionStrategy` avec une méthode `double convert(double total)`.
- Implémente plusieurs stratégies de conversion de devises :
  - `USDCurrencyConversionStrategy`
  - `EURCurrencyConversionStrategy`
  - `GBPCurrencyConversionStrategy`

#### 3 - Adapter la classe `ShoppingCart` pour utiliser ces stratégies
