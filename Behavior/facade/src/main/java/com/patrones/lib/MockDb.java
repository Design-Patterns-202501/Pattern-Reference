package com.patrones.lib;

import java.util.HashMap;

import com.patrones.schemas.Card;
import com.patrones.schemas.CardType;
import com.patrones.schemas.Client;

public class MockDb {

    private static final HashMap<Long, Client> clients = new HashMap<>();
    private static final HashMap<String, Card> cards = new HashMap<>();

    static {
        clients.put(1L, new Client(1L, "Mo Salah", 500, "Descontinuado"));
        clients.put(2L, new Client(2L, "Luis Diaz", 300, "Descontinuado"));
        clients.put(3L, new Client(3L, "Sadio Mane", 100, "Activo"));
        clients.put(4L, new Client(4L, "Alisson Becker", 100, "Inactivo"));

        cards.put("123", new Card("123", "VISA", CardType.CREDIT));
        cards.put("234", new Card("234", "MASTERCARD", CardType.DEBIT));
        cards.put("345", new Card("345", "NEQUI", CardType.CREDIT));
    };

    public static Client getClientById(Long id) {
        return clients.get(id);
    }

    public static boolean changeClientState(Long id, String state) {
        Client client = getClientById(id);
        if (client == null) return false;
        client.setState(state);
        return true;
    }

    public static boolean validateCard(String cardPrefix) {
        if (!cards.containsKey(cardPrefix)) return false;
        return true;
    };

    public static String getCardIssuer(String prefix) {
        if (!cards.containsKey(prefix)) return "#";
        return cards.get(prefix).getIssuer();
    }
}
