package ExerciciosHeranca;

public class AnimalMain {

	public static void main(String[] args) {
		
		CachorroClass dog = new CachorroClass("Nina", 14, true,"andar", "mistura de beagle e vira-lata");
		
		dog.infoCachorro();
		
		CavaloClass cavalo = new CavaloClass("Miguels", 7, true, "trotar", "preto");
				
		cavalo.infoCavalo();
		
		PreguiçaClass preguiça = new PreguiçaClass("megue", 3, true, "subir em árvores", "bege");
		
		preguiça.infoPreguiça();
	}

}