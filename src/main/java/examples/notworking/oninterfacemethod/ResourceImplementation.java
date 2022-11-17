package examples.notworking.oninterfacemethod;

import examples.Input;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ResourceImplementation implements ResourceInterface {
    @Override
    public String get(Input input)  {
        return "<tag>Success</tag>";
    }
}
