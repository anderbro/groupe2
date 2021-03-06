package fr.um3.miashs;

public class Tuile extends Coordonnees{


	private TypeTuile type;

	// constructeur de la tuile avec son type et ses coordonnées
	public Tuile(char car, int x, int y) {
		super (x,y);
		

		switch (car) {
		case 'X':
			type = TypeTuile.Joueur;
			break;

		case 'P':
			type = TypeTuile.Potion;
			break;

		case '#':
			type = TypeTuile.Mur;
			break;

		case '~':
			type = TypeTuile.Piege;
			break;

		case 'V':
			type = TypeTuile.Sortie;
			break;

		case ' ':
		default:
			type = TypeTuile.Vide;
			break;
		}

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public void setX(int x) {   //Ajout setter X et Y
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public TypeTuile getType() {
		return type;
	}

	public void setType(TypeTuile type) {
		this.type = type;
	}

	public char toChar() {
		//permet de retourner la case selon le type de la tuile
		switch (this.type) {
		case Joueur:
			return 'X';

		case Potion:
			return 'P';

		case Mur:
			return '#';

		case Piege:
			return '~';

		case Sortie:
			return 'V';

		case Vide:
		default:
			return ' ';

		}

	}

}

