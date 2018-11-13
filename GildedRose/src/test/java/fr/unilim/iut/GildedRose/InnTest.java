package fr.unilim.iut.GildedRose;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class InnTest {
	@Test
	public void should_return_right_construteur() {
		Inn inn = new Inn();
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));
		for (int i = 0; i < items.size(); i++) {
			assertEquals(inn.getItems().get(i).getName(),items.get(i).getName());
			assertEquals(inn.getItems().get(i).getQuality(), items.get(i).getQuality());
			assertEquals(inn.getItems().get(i).getSellIn(), items.get(i).getSellIn());
		}
	}
}
