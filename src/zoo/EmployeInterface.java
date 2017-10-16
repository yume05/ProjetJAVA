package zoo;
import zoo.MonEnclos;

import zoo.Animal;

public interface EmployeInterface {
	void examinerEnclos(MonEnclos enclos);
	void nettoyerEnclos(MonEnclos enclos);
	void nourirAnimauxEnclos(MonEnclos enclos);
	void transferAnimalEnclos(MonEnclos enclosOriginal, MonEnclos enclosFutur, Animal monAnimal);
}
