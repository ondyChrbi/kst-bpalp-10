# KST/BPALP - Cvičení 10

**27. 11. 2023**

Rozhraní

# Validátor

## Implementujte validátor parametrů:
- Rozhraní Validator:
  - **validuj()**: Kontroluje přítomnost chyby.
  - **dejChybovouHlasku()**: Vrací popis chyby.
- Vytvořte třídy implementující rozhranní:
  - **NeniZapornyValidator**
    - Hodnota parametru není záporná.
  - **JeVetsiNezValidator**
    - Hodnota parametru je větší než zadaná hodnota.
  - **RetezecNeniPrazdnyValidator**
    - Řetězec není prázdný.
- Vytvořte další třídy implementující rozhraní.
  - Vhodně zvolte název:
    - **Číslo měsíce** - zkoumá, zda předané číslo, je 1-12.
    - **Heslo (dostatečně)** silné - délka hesla je větší než 10, obsahuje jak malá, tak velká písmena.
    - **E-mail** - stačí zjednodušeně, zda zadaný řetězec obsahuje zavináč @.
