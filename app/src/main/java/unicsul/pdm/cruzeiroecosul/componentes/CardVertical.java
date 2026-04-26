package unicsul.pdm.cruzeiroecosul.componentes;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;

import unicsul.pdm.cruzeiroecosul.R;

public class CardVertical extends MaterialCardView {

    public CardVertical(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.card_vertical, this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CardVertical);

        ((ShapeableImageView) findViewById(R.id.cardVerticalImagem))
                .setImageResource(a.getResourceId(R.styleable.CardVertical_imagem, 0));
        ((TextView) findViewById(R.id.cardVerticalTitulo))
                .setText(a.getString(R.styleable.CardVertical_titulo));
        ((TextView) findViewById(R.id.cardVerticalDescricao))
                .setText(a.getString(R.styleable.CardVertical_descricao));
        ((TextView) findViewById(R.id.cardVerticalChip))
                .setText(a.getString(R.styleable.CardVertical_chip));

        a.recycle();
    }
}