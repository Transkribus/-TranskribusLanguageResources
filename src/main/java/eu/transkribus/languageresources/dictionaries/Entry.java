package eu.transkribus.languageresources.dictionaries;

import eu.transkribus.languageresources.interfaces.IEntry;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author max, jnphilipp
 */
public class Entry implements IEntry {
    private String name;
    private int frequency;
    private Map<String, Integer> values;

    public Entry(String name) {
        this(name, 1);
    }

    public Entry(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
        this.values = new LinkedHashMap<>();
    }

    public Map<String, Integer> getValues() {
        return this.values;
    }

    public String getName() {
        return this.name;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void increaseFrequency() {
        this.frequency++;
    }

    public void increaseFrequency(int increment) {
        this.frequency += increment;
    }

    public void addValue(String name) {
        this.values.put(name, this.values.containsKey(name) ? this.values.get(name) + 1 : 0);
    }

    public void addValue(String name, int frequency) {
        this.values.put(name, this.values.containsKey(name) ? this.values.get(name) + frequency : frequency);
    }

    public boolean containsKey(String name) {
        return this.values.containsKey(name);
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj != null )
            if ( obj instanceof Entry )
                if ( this.name == ((Entry)obj).getName() && this.frequency == ((Entry)obj).getFrequency() && this.values.equals(((Entry)obj).getValues()) )
                    return true;
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.name.hashCode();
        hash = 11 * hash + this.frequency;
        hash = 53 * hash + this.values.hashCode();
        return hash;
    }
}
