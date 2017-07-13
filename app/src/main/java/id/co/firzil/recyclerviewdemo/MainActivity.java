package id.co.firzil.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvInbox;
    private List<Inbox> inboxList;
    private InboxAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inboxList = new ArrayList<>();
        adapter = new InboxAdapter(inboxList);

        inboxList.add(new Inbox("Lundi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Andi", "halo ini pesan saya", "6 m"));
        inboxList.add(new Inbox("Rendi", "halo ini pesan saya", "8 m"));
        inboxList.add(new Inbox("Yandi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Sandi", "halo ini pesan saya", "9 m"));
        inboxList.add(new Inbox("Budi", "halo ini pesan saya", "10 m"));
        inboxList.add(new Inbox("Lundi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Andi", "halo ini pesan saya", "6 m"));
        inboxList.add(new Inbox("Rendi", "halo ini pesan saya", "8 m"));
        inboxList.add(new Inbox("Yandi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Sandi", "halo ini pesan saya", "9 m"));
        inboxList.add(new Inbox("Budi", "halo ini pesan saya", "10 m"));
        inboxList.add(new Inbox("Lundi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Andi", "halo ini pesan saya", "6 m"));
        inboxList.add(new Inbox("Rendi", "halo ini pesan saya", "8 m"));
        inboxList.add(new Inbox("Yandi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Sandi", "halo ini pesan saya", "9 m"));
        inboxList.add(new Inbox("Budi", "halo ini pesan saya", "10 m"));
        inboxList.add(new Inbox("Lundi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Andi", "halo ini pesan saya", "6 m"));
        inboxList.add(new Inbox("Rendi", "halo ini pesan saya", "8 m"));
        inboxList.add(new Inbox("Yandi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Sandi", "halo ini pesan saya", "9 m"));
        inboxList.add(new Inbox("Budi", "halo ini pesan saya", "10 m"));
        inboxList.add(new Inbox("Lundi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Andi", "halo ini pesan saya", "6 m"));
        inboxList.add(new Inbox("Rendi", "halo ini pesan saya", "8 m"));
        inboxList.add(new Inbox("Yandi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Sandi", "halo ini pesan saya", "9 m"));
        inboxList.add(new Inbox("Budi", "halo ini pesan saya", "10 m"));
        inboxList.add(new Inbox("Lundi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Andi", "halo ini pesan saya", "6 m"));
        inboxList.add(new Inbox("Rendi", "halo ini pesan saya", "8 m"));
        inboxList.add(new Inbox("Yandi", "halo ini pesan saya", "4 m"));
        inboxList.add(new Inbox("Sandi", "halo ini pesan saya", "9 m"));
        inboxList.add(new Inbox("Budi", "halo ini pesan saya", "10 m"));

        rvInbox = (RecyclerView) findViewById(R.id.rv_inbox);
        rvInbox.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvInbox.setAdapter(adapter);

        rvInbox.addOnItemTouchListener(new RecyclerTouchListener(this, rvInbox, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Inbox inbox = inboxList.get(position);
                Toast.makeText(MainActivity.this, "My Name Is : " + inbox.getName(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Inbox inbox = inboxList.get(position);
                Toast.makeText(MainActivity.this, "This Message is : " + inbox.getMessage(), Toast.LENGTH_LONG).show();
            }
        }));

    }
}
