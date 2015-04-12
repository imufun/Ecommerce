package dw.fdb.com.fdbapp;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class IntegerTypeAdapter implements JsonDeserializer<Double> {

    @Override
    public Double deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        try {
            return Double.parseDouble(element.getAsString().replace(',', '.'));
        } catch (NumberFormatException e) {
            throw new JsonParseException(e);
        }
    }
}