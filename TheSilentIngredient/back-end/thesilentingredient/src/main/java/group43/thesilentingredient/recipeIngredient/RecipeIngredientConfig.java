package group43.thesilentingredient.recipeIngredient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class RecipeIngredientConfig {

	@Bean
	CommandLineRunner RecipeIngredientsCR(RecipeIngredientRepository repository) {
		return args -> {
			
			//OBJECT NAME'S METHODOLOGY
			//r = recipe
			//{id}
			//ing = ingredient
			//{nr} = ingredient number
			// *** r{id}ing{nr} ***
			
			//ingredient_id, recipe_id, quantity, measurement
			
			//RECIPE ID - 1
			RecipeIngredient r1ing1 = new RecipeIngredient(1, 1, 92.5, "g");
			RecipeIngredient r1ing2 = new RecipeIngredient(2, 1, 100.0, "ml");
			RecipeIngredient r1ing3 = new RecipeIngredient(83, 1, 1.0, "tsp");
			//r1ing1, r1ing2, r1ing3
			
					
			//RECIPE ID - 2
			RecipeIngredient r2ing1 = new RecipeIngredient(81, 2, 1.0, "tbsp");
			RecipeIngredient r2ing2 = new RecipeIngredient(5, 2, 450.0, "g");
			RecipeIngredient r2ing3 = new RecipeIngredient(6, 2, 340.0, "g");
			RecipeIngredient r2ing4 = new RecipeIngredient(7, 2, 550.0, "g");
			RecipeIngredient r2ing5 = new RecipeIngredient(62, 2, 1.0, "quantity");
			//r2ing1, r2ing2, r2ing3, r2ing4, r2ing5
			
			
			//RECIPE ID - 3
			RecipeIngredient r3ing1 = new RecipeIngredient(8, 3, 1.0, "quantity");
			RecipeIngredient r3ing2 = new RecipeIngredient(9, 3, 1.0, "quantity");
			RecipeIngredient r3ing3 = new RecipeIngredient(10, 3, 3.0, "quantity");
			RecipeIngredient r3ing4 = new RecipeIngredient(11, 3, 2.0, "quantity");
			RecipeIngredient r3ing5 = new RecipeIngredient(12, 3, 1.0, "tbsp");
			//r3ing1, r3ing2, r3ing3, r3ing4, r3ing5
			
			//RECIPE ID - 4
			RecipeIngredient r4ing1 = new RecipeIngredient(77, 4, 1.0, "quantity");
			RecipeIngredient r4ing2 = new RecipeIngredient(83, 4, 0.5, "tsp");
			RecipeIngredient r4ing3 = new RecipeIngredient(13, 4, 0.5, "tsp");
			RecipeIngredient r4ing4 = new RecipeIngredient(5, 4, 450.0, "g");
			RecipeIngredient r4ing5 = new RecipeIngredient(14, 4, 60.0, "g");
			//r4ing1, r4ing2, r4ing3, r4ing4, r4ing5
			
			
			//RECIPE ID - 5
			RecipeIngredient r5ing1 = new RecipeIngredient(54, 5, 6.0, "quantity");
			RecipeIngredient r5ing2 = new RecipeIngredient(56, 5, 2.0, "quantity");
			RecipeIngredient r5ing3 = new RecipeIngredient(57, 5, 2.0, "tsp");
			RecipeIngredient r5ing4 = new RecipeIngredient(58, 5, 0.5, "tsp");
			RecipeIngredient r5ing5 = new RecipeIngredient(59, 5, 2.0, "quantity");
			RecipeIngredient r5ing6 = new RecipeIngredient(60, 5, 75.0, "g");
			RecipeIngredient r5ing7 = new RecipeIngredient(61, 5, 150.0, "g");
			//r5ing1, r5ing2, r5ing3, r5ing4, r5ing5, r5ing6, r5ing7
			
			
			//RECIPE ID - 6
			RecipeIngredient r6ing1 = new RecipeIngredient(62, 6, 2.0, "quantity");
			RecipeIngredient r6ing2 = new RecipeIngredient(63, 6, 400.0, "g");
			RecipeIngredient r6ing3 = new RecipeIngredient(64, 6, 1.5, "quantity");
			RecipeIngredient r6ing4 = new RecipeIngredient(65, 6, 2.0, "tbsp");
			RecipeIngredient r6ing5 = new RecipeIngredient(57, 6, 1.0, "tsp");
			//RecipeIngredient r6ing6 = new RecipeIngredient(asafoetida, 6, 0.5, "tsp");
			RecipeIngredient r6ing7 = new RecipeIngredient(60, 6, 2.0, "tsp");
			RecipeIngredient r6ing8 = new RecipeIngredient(67, 6, 400.0, "g");
			//RecipeIngredient r6ing9 = new RecipeIngredient(ginger, 6, 1.0, "tsp");
			RecipeIngredient r6ing10 = new RecipeIngredient(88, 6, 1.0, "tsp");
			//RecipeIngredient r6ing11 = new RecipeIngredient(green chilli paste, 6, 1.0, "tsp");
			RecipeIngredient r6ing12 = new RecipeIngredient(68, 6, 1.0, "tsp");
			RecipeIngredient r6ing13 = new RecipeIngredient(58, 6, 2.0, "tsp");
			//RecipeIngredient r6ing14 = new RecipeIngredient(dhana jeera powder, 6, 75.0, "g");
			RecipeIngredient r6ing15 = new RecipeIngredient(69, 6, 3.0, "quantity");
			//RecipeIngredient r6ing16 = new RecipeIngredient(garam masala, 6, 75.0, "g");
			//r6ing1, r6ing2, r6ing3, r6ing4, r6ing5, r6ing7, r6ing8, r6ing10, r6ing12, r6ing13, r6ing15
			
			
			//RECIPE ID - 7
			RecipeIngredient r7ing1 = new RecipeIngredient(65, 7, 75.0, "ml");
			//RecipeIngredient r7ing2 = new RecipeIngredient(ground flaxseed, 7, 6.0, "tbsp");
			RecipeIngredient r7ing3 = new RecipeIngredient(70, 7, 400.0, "g");
			RecipeIngredient r7ing4 = new RecipeIngredient(72, 7, 55.0, "g");
			RecipeIngredient r7ing5 = new RecipeIngredient(73, 7, 55.0, "g");
			RecipeIngredient r7ing6 = new RecipeIngredient(35, 7, 1.0, "tsp");
			RecipeIngredient r7ing7 = new RecipeIngredient(74, 7, 1.5, "tsp");
			RecipeIngredient r7ing8 = new RecipeIngredient(75, 7, 1.0, "tsp");
			//RecipeIngredient r7ing9 = new RecipeIngredient(coconut cream, 7, 200.0, "ml");
			RecipeIngredient r7ing10 = new RecipeIngredient(76, 7, 3.0, "tbsp");
			//r7ing1, r7ing3, r7ing4, r7ing5, r7ing6, r7ing7, r7ing8

			
			// RECIPE ID - 12
			RecipeIngredient r12ing1 = new RecipeIngredient(8, 12, 340.0, "g");
			RecipeIngredient r12ing2 = new RecipeIngredient(83, 12, 1.0, "tbsp");
			RecipeIngredient r12ing3 = new RecipeIngredient(77, 12, 114.0, "g");
			RecipeIngredient r12ing4 = new RecipeIngredient(81, 12, 250.0, "ml");
			RecipeIngredient r12ing5 = new RecipeIngredient(33, 12, 50.0, "g");
			
			
			// RECIPE ID - 13
			RecipeIngredient r13ing1 = new RecipeIngredient(8, 13, 340.0, "g");
			RecipeIngredient r13ing2 = new RecipeIngredient(52, 13, 540.0, "g");
			RecipeIngredient r13ing3 = new RecipeIngredient(50, 13, 80.0, "g");
			RecipeIngredient r13ing4 = new RecipeIngredient(83, 13, 1.0, "tbsp");
			RecipeIngredient r13ing5 = new RecipeIngredient(81, 13, 350.0, "ml");
			
			
			// RECIPE ID - 14
			RecipeIngredient r14ing1 = new RecipeIngredient(8, 14, 170.0, "g");
			RecipeIngredient r14ing2 = new RecipeIngredient(77, 14, 114.0, "g");
			RecipeIngredient r14ing3 = new RecipeIngredient(53, 14, 80.0, "g");
			RecipeIngredient r14ing4 = new RecipeIngredient(83, 14, 1.0, "tbsp");
			RecipeIngredient r14ing5 = new RecipeIngredient(68, 14, 2.0, "tbsp");
			RecipeIngredient r14ing6 = new RecipeIngredient(81, 14, 15.0, "ml");
			
			
			// RECIPE ID - 15
			RecipeIngredient r15ing1 = new RecipeIngredient(28, 15, 200.0, "g");
			RecipeIngredient r15ing2 = new RecipeIngredient(81, 15, 3.0, "tbsp");
			RecipeIngredient r15ing3 = new RecipeIngredient(15, 15, 15.0, "g");
			RecipeIngredient r15ing4 = new RecipeIngredient(16, 15, 5.0, "g");
			RecipeIngredient r15ing5 = new RecipeIngredient(17, 15, 270.0, "g");
			RecipeIngredient r15ing6 = new RecipeIngredient(18, 15, 125.0, "ml");
			RecipeIngredient r15ing7 = new RecipeIngredient(19, 15, 90.0, "ml");
			RecipeIngredient r15ing8 = new RecipeIngredient(20, 15, 350.0, "g");
			RecipeIngredient r15ing9 = new RecipeIngredient(21, 15, 50.0, "g");
						
						
			//RECIPE ID - 16
			RecipeIngredient r16ing1 = new RecipeIngredient(81, 16, 90.0, "g");
			RecipeIngredient r16ing2 = new RecipeIngredient(38, 16, 220.0, "g");
			RecipeIngredient r16ing3 = new RecipeIngredient(22, 16, 45.0, "g");
			RecipeIngredient r16ing4 = new RecipeIngredient(15, 16, 5.0, "g");
			RecipeIngredient r16ing5 = new RecipeIngredient(69, 16, 16.0, "g");
			RecipeIngredient r16ing6 = new RecipeIngredient(23, 16, 800.0, "ml");
			RecipeIngredient r16ing7 = new RecipeIngredient(60, 16, 1.0, "tsp");
			RecipeIngredient r16ing8 = new RecipeIngredient(77, 16, 228.0, "g");
			
						
			repository.saveAll(List.of(r1ing1, r1ing2, r1ing3,
					r2ing1, r2ing2, r2ing3, r2ing4, r2ing5,
					r3ing1, r3ing2, r3ing3, r3ing4, r3ing5,
					r4ing1, r4ing2, r4ing3, r4ing4, r4ing5,
					r5ing1, r5ing2, r5ing3, r5ing4, r5ing5, r5ing6, r5ing7,
					r6ing1, r6ing2, r6ing3, r6ing4, r6ing5, r6ing7, r6ing8, r6ing10, r6ing12, r6ing13, r6ing15,
					r7ing1, r7ing3, r7ing4, r7ing5, r7ing6, r7ing7, r7ing8,
					r12ing1, r12ing2, r12ing3, r12ing4, r12ing5,
					r13ing1, r13ing2, r13ing3, r13ing4, r13ing5,
					r14ing1, r14ing2, r14ing3, r14ing4, r14ing5, r14ing6,
					r15ing1, r15ing2, r15ing3, r15ing4, r15ing5, r15ing6, r15ing7, r15ing8, r15ing9,
					r16ing1, r16ing2, r16ing3, r16ing4, r16ing5, r16ing6, r16ing7, r16ing8));
		};
	}
}
