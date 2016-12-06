package Activities;

import android.app.Activity;
import android.os.Bundle;

import ru.mapkittest.R;
import ru.yandex.yandexmapkit.MapController;
import ru.yandex.yandexmapkit.MapView;

/**
 * Created by Taras on 03.12.2016.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample);

        MapView mapView = (MapView) findViewById(R.id.map);
        MapController mapController = mapView.getMapController();

    }
}
