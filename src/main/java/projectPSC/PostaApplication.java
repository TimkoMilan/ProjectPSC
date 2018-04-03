package projectPSC;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import projectPSC.resources.posta;

public class PostaApplication extends Application<PostaConfiguration> {

    public static void main(final String[] args) throws Exception {
        new PostaApplication().run(args);
    }

    @Override
    public String getName() {
        return "projectPSC";
    }

    @Override
    public void initialize(final Bootstrap<PostaConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final PostaConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new posta());
    }

}
