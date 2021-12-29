package mob_grinding_utils.models;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModelSawBlade extends Model {
	ModelPart main;
	ModelPart back;
	ModelPart front;
	ModelPart left;
	ModelPart right;
	ModelPart tooth1Main;
	ModelPart tooth2Main;
	ModelPart tooth3Main;
	ModelPart tooth4Main;
	ModelPart tooth5Main;
	ModelPart tooth6Main;
	ModelPart tooth7Main;
	ModelPart tooth8Main;
	ModelPart tooth9Main;
	ModelPart tooth10Main;
	ModelPart tooth11Main;
	ModelPart tooth12Main;
	ModelPart tooth13Main;
	ModelPart tooth14Main;
	ModelPart tooth15Main;
	ModelPart tooth16Main;
	ModelPart tooth1End;
	ModelPart tooth2End;
	ModelPart tooth3End;
	ModelPart tooth4End;
	ModelPart tooth5End;
	ModelPart tooth6End;
	ModelPart tooth7End;
	ModelPart tooth8End;
	ModelPart tooth9End;
	ModelPart tooth10End;
	ModelPart tooth11End;
	ModelPart tooth12End;
	ModelPart tooth13End;
	ModelPart tooth14End;
	ModelPart tooth15End;
	ModelPart tooth16End;

	public ModelSawBlade() {
		super(RenderType::entitySolid);
		texWidth = 64;
		texHeight = 32;

		main = new ModelPart(this, 0, 9);
		main.addBox(-5F, -0.5F, -5F, 10, 1, 10);
		main.setPos(0F, 16F, 0F);
		setRotation(main, 0F, 0F, 0F);
		back = new ModelPart(this, 0, 0);
		back.addBox(-6F, -0.5F, -3.5F, 1, 1, 7);
		back.setPos(0F, 16F, 0F);
		setRotation(back, 0F, 1.570796F, 0F);
		front = new ModelPart(this, 0, 0);
		front.addBox(-6F, -0.5F, -3.5F, 1, 1, 7);
		front.setPos(0F, 16F, 0F);
		setRotation(front, 0F, -1.570796F, 0F);
		left = new ModelPart(this, 0, 0);
		left.addBox(5F, -0.5F, -3.5F, 1, 1, 7);
		left.setPos(0F, 16F, 0F);
		setRotation(left, 0F, 0F, 0F);
		right = new ModelPart(this, 0, 0);
		right.addBox(-6F, -0.5F, -3.5F, 1, 1, 7);
		right.setPos(0F, 16F, 0F);
		setRotation(right, 0F, 0F, 0F);
		tooth1Main = new ModelPart(this, 0, 3);
		tooth1Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth1Main.setPos(0F, 16F, 0F);
		setRotation(tooth1Main, 0F, -1.570796F, 0F);
		tooth2Main = new ModelPart(this, 0, 3);
		tooth2Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth2Main.setPos(0F, 16F, 0F);
		setRotation(tooth2Main, 0F, -1.178097F, 0F);
		tooth3Main = new ModelPart(this, 0, 3);
		tooth3Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth3Main.setPos(0F, 16F, 0F);
		setRotation(tooth3Main, 0F, -0.7853982F, 0F);
		tooth4Main = new ModelPart(this, 0, 3);
		tooth4Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth4Main.setPos(0F, 16F, 0F);
		setRotation(tooth4Main, 0F, -0.3926991F, 0F);
		tooth5Main = new ModelPart(this, 0, 3);
		tooth5Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth5Main.setPos(0F, 16F, 0F);
		setRotation(tooth5Main, 0F, 0F, 0F);
		tooth6Main = new ModelPart(this, 0, 3);
		tooth6Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth6Main.setPos(0F, 16F, 0F);
		setRotation(tooth6Main, 0F, 0.3926991F, 0F);
		tooth7Main = new ModelPart(this, 0, 3);
		tooth7Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth7Main.setPos(0F, 16F, 0F);
		setRotation(tooth7Main, 0F, 0.7853982F, 0F);
		tooth8Main = new ModelPart(this, 0, 3);
		tooth8Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth8Main.setPos(0F, 16F, 0F);
		setRotation(tooth8Main, 0F, 1.178097F, 0F);
		tooth9Main = new ModelPart(this, 0, 3);
		tooth9Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth9Main.setPos(0F, 16F, 0F);
		setRotation(tooth9Main, 0F, 1.570796F, 0F);
		tooth10Main = new ModelPart(this, 0, 3);
		tooth10Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth10Main.setPos(0F, 16F, 0F);
		setRotation(tooth10Main, 0F, 1.963495F, 0F);
		tooth11Main = new ModelPart(this, 0, 3);
		tooth11Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth11Main.setPos(0F, 16F, 0F);
		setRotation(tooth11Main, 0F, 2.356194F, 0F);
		tooth12Main = new ModelPart(this, 0, 3);
		tooth12Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth12Main.setPos(0F, 16F, 0F);
		setRotation(tooth12Main, 0F, 2.748893F, 0F);
		tooth13Main = new ModelPart(this, 0, 3);
		tooth13Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth13Main.setPos(0F, 16F, 0F);
		setRotation(tooth13Main, 0F, 3.141593F, 0F);
		tooth14Main = new ModelPart(this, 0, 3);
		tooth14Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth14Main.setPos(0F, 16F, 0F);
		setRotation(tooth14Main, 0F, -2.748893F, 0F);
		tooth15Main = new ModelPart(this, 0, 3);
		tooth15Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth15Main.setPos(0F, 16F, 0F);
		setRotation(tooth15Main, 0F, -2.356194F, 0F);
		tooth16Main = new ModelPart(this, 0, 3);
		tooth16Main.addBox(-7F, -0.5F, -1F, 1, 1, 2);
		tooth16Main.setPos(0F, 16F, 0F);
		setRotation(tooth16Main, 0F, -1.963495F, 0F);
		tooth1End = new ModelPart(this, 0, 0);
		tooth1End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth1End.setPos(0F, 16F, 0F);
		setRotation(tooth1End, 0F, -1.570796F, 0F);
		tooth2End = new ModelPart(this, 0, 0);
		tooth2End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth2End.setPos(0F, 16F, 0F);
		setRotation(tooth2End, 0F, -1.178097F, 0F);
		tooth3End = new ModelPart(this, 0, 0);
		tooth3End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth3End.setPos(0F, 16F, 0F);
		setRotation(tooth3End, 0F, -0.7853982F, 0F);
		tooth4End = new ModelPart(this, 0, 0);
		tooth4End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth4End.setPos(0F, 16F, 0F);
		setRotation(tooth4End, 0F, -0.3926991F, 0F);
		tooth5End = new ModelPart(this, 0, 0);
		tooth5End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth5End.setPos(0F, 16F, 0F);
		setRotation(tooth5End, 0F, 0F, 0F);
		tooth6End = new ModelPart(this, 0, 0);
		tooth6End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth6End.setPos(0F, 16F, 0F);
		setRotation(tooth6End, 0F, 0.3926991F, 0F);
		tooth7End = new ModelPart(this, 0, 0);
		tooth7End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth7End.setPos(0F, 16F, 0F);
		setRotation(tooth7End, 0F, 0.7853982F, 0F);
		tooth8End = new ModelPart(this, 0, 0);
		tooth8End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth8End.setPos(0F, 16F, 0F);
		setRotation(tooth8End, 0F, 1.178097F, 0F);
		tooth9End = new ModelPart(this, 0, 0);
		tooth9End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth9End.setPos(0F, 16F, 0F);
		setRotation(tooth9End, 0F, 1.570796F, 0F);
		tooth10End = new ModelPart(this, 0, 0);
		tooth10End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth10End.setPos(0F, 16F, 0F);
		setRotation(tooth10End, 0F, 1.963495F, 0F);
		tooth11End = new ModelPart(this, 0, 0);
		tooth11End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth11End.setPos(0F, 16F, 0F);
		setRotation(tooth11End, 0F, 2.356194F, 0F);
		tooth12End = new ModelPart(this, 0, 0);
		tooth12End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth12End.setPos(0F, 16F, 0F);
		setRotation(tooth12End, 0F, 2.748893F, 0F);
		tooth13End = new ModelPart(this, 0, 0);
		tooth13End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth13End.setPos(0F, 16F, 0F);
		setRotation(tooth13End, 0F, 3.141593F, 0F);
		tooth14End = new ModelPart(this, 0, 0);
		tooth14End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth14End.setPos(0F, 16F, 0F);
		setRotation(tooth14End, 0F, -2.748893F, 0F);
		tooth15End = new ModelPart(this, 0, 0);
		tooth15End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth15End.setPos(0F, 16F, 0F);
		setRotation(tooth15End, 0F, -2.356194F, 0F);
		tooth16End = new ModelPart(this, 0, 0);
		tooth16End.addBox(-8F, -0.5F, -1F, 1, 1, 1);
		tooth16End.setPos(0F, 16F, 0F);
		setRotation(tooth16End, 0F, -1.963495F, 0F);
	}
	
	public void renderToBuffer(PoseStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		ImmutableList.of(main, back, front, left, right, tooth1Main, tooth2Main, tooth3Main, tooth4Main, tooth5Main,
				tooth6Main, tooth7Main, tooth8Main, tooth9Main, tooth10Main, tooth11Main, tooth12Main, tooth13Main,
				tooth14Main, tooth15Main, tooth16Main, tooth1End, tooth2End, tooth3End, tooth4End, tooth5End, tooth6End,
				tooth7End, tooth8End, tooth9End, tooth10End, tooth11End, tooth12End, tooth13End, tooth14End, tooth15End,
				tooth16End).forEach((p_228279_8_) -> { p_228279_8_.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
				});
	}

	private void setRotation(ModelPart model, float x, float y, float z) {
		model.xRot = x;
		model.yRot = y;
		model.zRot = z;
	}

}
