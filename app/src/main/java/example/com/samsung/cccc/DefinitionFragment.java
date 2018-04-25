package example.com.samsung.cccc;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DefinitionFragment extends Fragment {
    public final static String ARG_POSITION = "position";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_definition, container, false);
        Bundle args = getArguments();
        if(args != null){
            TextView definition = view.findViewById(R.id.definition);
            definition.setText(Data.definitions[args.getInt(ARG_POSITION)].toString());
        }

        return view;
    }

}
