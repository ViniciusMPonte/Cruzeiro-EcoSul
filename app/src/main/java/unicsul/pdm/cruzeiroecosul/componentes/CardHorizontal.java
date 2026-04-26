package unicsul.pdm.cruzeiroecosul.componentes;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

import unicsul.pdm.cruzeiroecosul.R;

public class CardHorizontal extends MaterialCardView {

    public CardHorizontal(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.card_horizontal, this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CardHorizontal);

        ((TextView) findViewById(R.id.cardHorizontalTitulo))
                .setText(a.getString(R.styleable.CardHorizontal_dicaTitulo));
        ((TextView) findViewById(R.id.cardHorizontalDescricao))
                .setText(a.getString(R.styleable.CardHorizontal_dicaDescricao));
        ((ImageView) findViewById(R.id.cardHorizontalIcone))
                .setImageResource(a.getResourceId(R.styleable.CardHorizontal_dicaIcone, 0));

        a.recycle();
    }
}