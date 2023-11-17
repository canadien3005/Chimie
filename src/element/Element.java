package element;

public class Element {

    private int numeroAtomique;
    private double masseAtomique;
    private int nombreNeutrons;
    private int nombreProtons;
    private int nombreElectrons;

    public Element(int numeroAtomique, double masseAtomique){
        this.numeroAtomique = numeroAtomique;
        this.masseAtomique = masseAtomique;
        this.nombreNeutrons = NombreNeutrons();
        this.nombreProtons = numeroAtomique;
        this.nombreElectrons = numeroAtomique;
    }

    /*Getter*/

    public int getNumeroAtomique() {
        return numeroAtomique;
    }

    public double getMasseAtomique() {
        return masseAtomique;
    }

    public int getNombreNeutrons() {
        return nombreNeutrons;
    }

    public int getNombreProtons() {
        return nombreProtons;
    }

    public void setNombreElectrons(int nombreElectrons) {
        this.nombreElectrons = nombreElectrons;
    }

    /*Setter*/

    public void setNumeroAtomique(int numeroAtomique) {
        this.numeroAtomique = numeroAtomique;
    }

    public void setMasseAtomique(double masseAtomique) {
        this.masseAtomique = masseAtomique;
    }

    public void setNombreNeutrons(int nombreNeutrons) {
        this.nombreNeutrons = nombreNeutrons;
    }

    public void setNombreProtons(int nombreProtons) {
        this.nombreProtons = nombreProtons;
    }

    public int getNombreElectrons() {
        return nombreElectrons;
    }

    /*Method*/

    private int NombreNeutrons(){
        return (int) this.masseAtomique - this.numeroAtomique;
    }

    @Override
    public String toString() {
        return "Numéro Atomique: " + numeroAtomique + "\nMasse Atomique : " + masseAtomique + "\nNeutrons : " + nombreNeutrons + "\nProtons : " + nombreProtons + "\nElectrons : " + nombreElectrons;
    }
}
