package unicsul.pdm.cruzeiroecosul.componentes;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import unicsul.pdm.cruzeiroecosul.R;

public class CardDica extends MaterialCardView {

    public CardDica(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.card_dica, this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CardDica);

        ((TextView) findViewById(R.id.cardDicaTitulo))
                .setText(a.getString(R.styleable.CardDica_dicaTitulo));
        ((TextView) findViewById(R.id.cardDicaDescricao))
                .setText(a.getString(R.styleable.CardDica_dicaDescricao));
        ((ImageView) findViewById(R.id.cardDicaIcone))
                .setImageResource(a.getResourceId(R.styleable.CardDica_dicaIcone, 0));

        a.recycle();
    }
}