package unicsul.pdm.cruzeiroecosul.componentes;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;

import unicsul.pdm.cruzeiroecosul.R;

public class CardVertical extends MaterialCardView {

    public CardVertical(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.card_vertical, this);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CardVertical);

        ShapeableImageView imagem = findViewById(R.id.cardVerticalImagem);
        TextView titulo = findViewById(R.id.cardVerticalTitulo);
        TextView descricao = findViewById(R.id.cardVerticalDescricao);
        TextView chip = findViewById(R.id.cardVerticalChip);
        GradientDrawable chipBackground = (GradientDrawable) chip.getBackground();

        imagem.setImageResource(a.getResourceId(R.styleable.CardVertical_imagem, 0));
        titulo.setText(a.getString(R.styleable.CardVertical_titulo));
        descricao.setText(a.getString(R.styleable.CardVertical_descricao));
        chip.setText(a.getString(R.styleable.CardVertical_chip));

        int corChip = a.getColor(R.styleable.CardVertical_corChip, ContextCompat.getColor(context, R.color.chip));
        int corTextoChip = a.getColor(R.styleable.CardVertical_corTextChip, ContextCompat.getColor(context, R.color.black));

        chipBackground.setColor(corChip);
        chip.setTextColor(corTextoChip);

        a.recycle();
    }
}