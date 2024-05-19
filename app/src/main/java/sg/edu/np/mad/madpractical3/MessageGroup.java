package sg.edu.np.mad.madpractical3;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_message_group);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Create instances of Fragment1 and Fragment2
        final Fragment1 fragment1 = new Fragment1();
        final Fragment2 fragment2 = new Fragment2();

        // Set OnClickListener for "GROUP 1" button
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace current fragment with Fragment1
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.imageView, fragment1)
                        .commit();
            }
        });

        // Set OnClickListener for "GROUP 2" button
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace current fragment with Fragment2
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.imageView, fragment2)
                        .commit();
            }
        });
    }
}
