package id.co.firzil.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kakaroto on 13/07/17.
 */

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.ViewHolder> {

    private List<Inbox> inboxes;

    public InboxAdapter(List<Inbox> inboxes) {
        this.inboxes = inboxes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inbox, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Inbox inbox = inboxes.get(position);
        holder.tvName.setText(inbox.getName());
        holder.tvMessage.setText(inbox.getMessage());
        holder.tvTime.setText(inbox.getTime());
    }

    @Override
    public int getItemCount() {
        return inboxes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName, tvMessage, tvTime;

        public ViewHolder(View itemView) {
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvMessage = (TextView) itemView.findViewById(R.id.tv_message);
            tvTime = (TextView) itemView.findViewById(R.id.tv_time);
        }
    }

}
