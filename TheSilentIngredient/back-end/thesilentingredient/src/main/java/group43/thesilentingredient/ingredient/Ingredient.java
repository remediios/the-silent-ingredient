package group43.thesilentingredient.ingredient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*@Entity
@Table
public class Ingredient {

	@Id
	@SequenceGenerator(
			name = "ingredient_sequence",
			sequenceName = "ingredient_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "ingredient_sequence"
			)
	
	private Long id;
	private String name;
	private int calories;
	private int protein;
	private int carbohydrate;
	private int fat;
	
	public Ingredient() {
	}

	public Ingredient(Long id, String name, int calories, int protein, int carbohydrate, int fat) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.fat = fat;
	}
	
	public Ingredient(String name, int calories, int protein, int carbohydrate, int fat) {
		this.name = name;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.fat = fat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}
	public int getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}
	
	public String toString() {
		return "Ingredient{" +
				"id=" + id + 
				", name='" + name +
				", calories='" + calories +
				", protein='"+ protein +
				", carbohydrate='"+carbohydrate +
				", fat='"+fat+"'}";
	}
}*/