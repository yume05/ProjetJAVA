package zoo;
import zoo.Enclos;

import zoo.Animal;

public interface EmployeInterface {
	void examinerEnclos(Enclos enclos);
	void nettoyerEnclos(Enclos enclos);
	void nourirAnimauxEnclos(Enclos enclos);
	void transferAnimalEnclos(Enclos enclosOriginal, Enclos enclosFutur, Animal monAnimal);
}
