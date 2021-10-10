package seedu.commands;

import seedu.data.exception.FridgetException;
import seedu.data.ingredient.Ingredient;
import seedu.parser.Parser;
import seedu.storage.IngredientList;
import seedu.storage.Notification;
import seedu.ui.Ui;

import java.util.ArrayList;

public class ExpiringCommand extends Command {
    public ExpiringCommand() {
    }

    @Override
    public void execute(Ui ui, Parser parser, IngredientList ingredientList, Notification notification) throws FridgetException {
        String sortByExpiry = "e";
        ArrayList<Ingredient> listOfIngredients = ingredientList.getIngredientList(sortByExpiry);
        ui.printExpiringMessage(listOfIngredients);
    }
}
