package level1.exercise1;
/*
- Exercici 1
Crea una classe anomenada NoGenericMethods que emmagatzemi
tres arguments del mateix tipus, juntament amb els mètodes
per a emmagatzemar i extreure aquests objectes i un constructor
per a inicialitzar els tres. Comprova que els arguments es
poden posar en qualsevol posició en la crida al constructor.
 */
public class  NoGenericMethods <T1,T2,T3>{
    private T1 firstValue;
    private T2 secondValue;
    private T3 thridValue;

    public NoGenericMethods(T2 secondValue, T3 thridValue ,T1 firstValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thridValue = thridValue;
    }

    public T1 getFirstValue() {
        return firstValue;
    }

    public T2 getSecondValue() {
        return secondValue;
    }

    public T3 getThridValue() {
        return thridValue;
    }
}
