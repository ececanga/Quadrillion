package ViewModels.PieceViews;

import DataModels.PieceModels.VPiece;
import javafx.scene.paint.Color;
import javafx.scene.transform.Translate;
import sample.Glob;

public class VPieceView extends PieceView {

    public VPieceView(){
        // Create the piece
        p = new VPiece();

        // Draw the shape
        this.getPoints().addAll(gl*-1, gl*-2,
                gl*0, gl*-2,
                gl*0, gl*0,
                gl*2, gl*0,
                gl*2, gl*1,
                gl*-1, gl*1);

        // Fix the axis for rotation. Refer to ref/axis_fix.png

        // Next line visually translates the polygon while leaving the rotation axis unchanged. Step 1
        this.getTransforms().add(new Translate(gl/2, -gl/2));

        // Next two lines also visually translate the polygon and changes the rotation axis at the same time. Step 2
        this.setTranslateX(-gl/2);
        this.setTranslateY(gl/2);

        // Paint the piece
        this.setFill(Glob.VPieceDisplacedColor);
        this.setStroke(Color.BLACK);
    }

    public void place(){
        this.setFill(Glob.VPiecePlacedColor);
    }

    public void displace(){
        this.setFill(Glob.VPieceDisplacedColor);
    }
}