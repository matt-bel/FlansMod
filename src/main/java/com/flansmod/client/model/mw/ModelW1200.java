package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;

public class ModelW1200 extends ModelGun 
{
	int textureX = 512;
	int textureY = 128;

	public ModelW1200() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[43];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		gunModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		gunModel[2] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2
		gunModel[3] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 3
		gunModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 4
		gunModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 6
		gunModel[7] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 7
		gunModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 8
		gunModel[9] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 10
		gunModel[10] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 11
		gunModel[11] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 12
		gunModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 14
		gunModel[13] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 15
		gunModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 16
		gunModel[15] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 17
		gunModel[16] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 18
		gunModel[17] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 19
		gunModel[18] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 20
		gunModel[19] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 21
		gunModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 24
		gunModel[21] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 25
		gunModel[22] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 28
		gunModel[23] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 29
		gunModel[24] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 31
		gunModel[25] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 32
		gunModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 39
		gunModel[27] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 42
		gunModel[28] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 43
		gunModel[29] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 44
		gunModel[30] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 46
		gunModel[31] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Box 47
		gunModel[32] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 48
		gunModel[33] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 52
		gunModel[34] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 53
		gunModel[35] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Box 54
		gunModel[36] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 55
		gunModel[37] = new ModelRendererTurbo(this, 2, 62, textureX, textureY); // Box 79
		gunModel[38] = new ModelRendererTurbo(this, 1, 68, textureX, textureY); // Box 80
		gunModel[39] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 48
		gunModel[40] = new ModelRendererTurbo(this, 2, 62, textureX, textureY); // Box 77
		gunModel[41] = new ModelRendererTurbo(this, 1, 16, textureX, textureY); // Box 53
		gunModel[42] = new ModelRendererTurbo(this, 413, 23, textureX, textureY); // Box 54

		gunModel[0].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 0
		gunModel[0].setRotationPoint(-1F, -3.5F, -0.5F);

		gunModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 1
		gunModel[1].setRotationPoint(2F, -4.5F, -0.5F);

		gunModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		gunModel[2].setRotationPoint(0F, -5.5F, -0.5F);

		gunModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 3
		gunModel[3].setRotationPoint(-10F, -4.5F, -0.5F);

		gunModel[4].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.75F, 0F, 0F); // Box 4
		gunModel[4].setRotationPoint(-10F, -3.5F, -0.5F);

		gunModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		gunModel[5].setRotationPoint(0F, -5.5F, -1.5F);

		gunModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 6
		gunModel[6].setRotationPoint(0F, -5.5F, 0.5F);

		gunModel[7].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.05F, 0F, -0.8F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.25F, 0F, -0.8F); // Box 7
		gunModel[7].setRotationPoint(-10F, -4.5F, 0.5F);

		gunModel[8].addShapeBox(0F, 0F, 0F, 12, 1, 1, 0F, -0.05F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.05F, 0F, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 8
		gunModel[8].setRotationPoint(-10F, -4.5F, -1.5F);

		gunModel[9].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.25F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.8F, -0.25F, -2F, -0.8F, -0.25F, -2F, 0F, -0.75F, 0F, 0F); // Box 10
		gunModel[9].setRotationPoint(-10F, -3.5F, -1.5F);

		gunModel[10].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, -0.25F, 0F, -0.8F, -0.75F, 0F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, -0.8F, -0.75F, 0F, -0.8F); // Box 11
		gunModel[10].setRotationPoint(-10F, -3.5F, 0.5F);

		gunModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, -0.75F, -0.25F); // Box 12
		gunModel[11].setRotationPoint(2F, -3.5F, -0.5F);

		gunModel[12].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, -0.65F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 14
		gunModel[12].setRotationPoint(1F, -2.5F, -0.5F);

		gunModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 15
		gunModel[13].setRotationPoint(3F, -3.5F, -0.5F);

		gunModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 16
		gunModel[14].setRotationPoint(4F, -3.5F, -0.5F);

		gunModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, -0.25F, -0.3F, 0F, -0.25F, -0.3F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 17
		gunModel[15].setRotationPoint(4F, -3.5F, -0.5F);

		gunModel[16].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 18
		gunModel[16].setRotationPoint(2F, -6.5F, -0.5F);

		gunModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		gunModel[17].setRotationPoint(2F, -5.5F, -1.5F);

		gunModel[18].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 20
		gunModel[18].setRotationPoint(2F, -5.5F, 0.5F);

		gunModel[19].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		gunModel[19].setRotationPoint(4F, -4.5F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.2F, -0.8F, 0.5F, -0.2F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0.5F, 0F, -0.8F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 24
		gunModel[20].setRotationPoint(4F, -5.5F, -1.5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		gunModel[21].setRotationPoint(8F, -5.5F, -1.5F);

		gunModel[22].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 28
		gunModel[22].setRotationPoint(5F, -4.5F, -0.5F);

		gunModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 29
		gunModel[23].setRotationPoint(8F, -5.5F, -0.5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F, 0F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 31
		gunModel[24].setRotationPoint(9F, -5.5F, -0.5F);

		gunModel[25].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0.25F, -0.125F, -0.125F, 0F, -0.125F, -0.125F); // Box 32
		gunModel[25].setRotationPoint(9F, -4.5F, -0.5F);

		gunModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		gunModel[26].setRotationPoint(18F, -5.5F, -0.5F);

		gunModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, 0F, -0.8F, -0.05F, -0.5F, -0.8F, -0.05F, -0.5F, -0.8F, -0.05F, 0F, -0.8F, -0.05F, 0F, 0F, -0.05F, -0.5F, 0F, -0.05F, -0.5F, 0F, -0.05F, 0F, 0F, -0.05F); // Box 42
		gunModel[27].setRotationPoint(3.5F, -6.5F, -0.5F);

		gunModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.8F, -0.25F, -0.5F, -0.8F, -0.25F, -0.5F, -0.05F, 0F, -0.5F, -0.05F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F); // Box 43
		gunModel[28].setRotationPoint(3.5F, -6.5F, -0.5F);

		gunModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.05F, -0.25F, -0.5F, -0.05F, -0.25F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.05F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 44
		gunModel[29].setRotationPoint(3.5F, -6.5F, -0.5F);

		gunModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, -0.8F, -0.25F, -0.5F, -0.8F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 46
		gunModel[30].setRotationPoint(23F, -6.5F, -0.5F);

		gunModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, -0.8F, 0F, -0.5F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 47
		gunModel[31].setRotationPoint(23F, -6.5F, -0.5F);

		gunModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.45F, -0.625F, -0.45F, -0.45F, -0.625F, -0.45F, -0.45F, -0.625F, -0.45F, -0.45F, -0.625F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F); // Box 48
		gunModel[32].setRotationPoint(23F, -6.5F, -0.5F);

		gunModel[33].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.925F, 0F, -0.75F, -0.925F, 0F, -0.75F, -0.925F, 0F, 0F, -0.925F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 52
		gunModel[33].setRotationPoint(6F, -4.5F, -0.5F);

		gunModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, -0.75F, -0.925F, 0F, 0F, -0.925F, 0F, 0F, -0.925F, 0F, -0.75F, -0.925F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 53
		gunModel[34].setRotationPoint(7F, -4.5F, -0.5F);

		gunModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.925F, 0F, -0.25F, -0.925F, 0F, -0.25F, -0.925F, -0.675F, -0.25F, -0.925F, -0.675F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.675F, -0.25F, 0F, -0.675F); // Box 54
		gunModel[35].setRotationPoint(6F, -4.5F, -0.5F);

		gunModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F, -0.25F, -0.925F, -0.675F, -0.25F, -0.925F, -0.675F, -0.25F, -0.925F, 0F, -0.25F, -0.925F, 0F, -0.25F, 0F, -0.675F, -0.25F, 0F, -0.675F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 55
		gunModel[36].setRotationPoint(6F, -4.5F, -0.5F);

		gunModel[37].addShapeBox(0F, 0F, 0F, 45, 3, 1, 0F, 0F, 0F, 0.1F, -36F, 0F, 0.1F, -36F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -2.1F, 0.1F, -36F, -2.1F, 0.1F, -36F, -2.1F, -1F, 0F, -2.1F, -1F); // Box 79
		gunModel[37].setRotationPoint(9F, -5.5F, 0.5F);

		gunModel[38].addShapeBox(0F, 0F, 0F, 45, 1, 3, 0F, 0F, -1F, -0.1F, -36F, -1F, -0.1F, -36F, -1F, -2.1F, 0F, -1F, -2.1F, 0F, 0.1F, -0.1F, -36F, 0.1F, -0.1F, -36F, 0.1F, -2.1F, 0F, 0.1F, -2.1F); // Box 80
		gunModel[38].setRotationPoint(9F, -6.5F, -0.5F);

		gunModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F, 0F, 0.1F, -0.125F); // Box 48
		gunModel[39].setRotationPoint(23F, -6.5F, -0.5F);

		gunModel[40].addShapeBox(0F, 0F, 0F, 45, 3, 1, 0F, 0F, -0.1F, -1F, -36F, -0.1F, -1F, -36F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -2.1F, -1F, -36F, -2.1F, -1F, -36F, -2.1F, 0.1F, 0F, -2.1F, 0.1F); // Box 77
		gunModel[40].setRotationPoint(9F, -5.5F, -1.5F);

		gunModel[41].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F, 0F, -0.8F, 0F, -4.05F, -0.8F, 0F, -4.05F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, -4.05F, 0F, 0F, -4.05F, 0F, 0F, 0F, 0F, 0F); // Box 53
		gunModel[41].setRotationPoint(5F, -6.5F, -0.5F);

		gunModel[42].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F, 0F, 0.125F, -0.25F, -0.125F, 0.125F, -0.25F, -0.125F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, 0F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, -0.125F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 54
		gunModel[42].setRotationPoint(9F, -4.5F, -0.5F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 49

		ammoModel[0].addShapeBox(0F, 0F, 0F, 14, 6, 6, 0F, -0.1F, -0.1F, -0.1F, -12.1F, -0.1F, -0.1F, -12.1F, -0.1F, -5.1F, -0.1F, -0.1F, -5.1F, -0.1F, -5.1F, -0.1F, -12.1F, -5.1F, -0.1F, -12.1F, -5.1F, -5.1F, -0.1F, -5.1F, -5.1F); // Box 49
		ammoModel[0].setRotationPoint(6F, -4.5F, -0.5F);


		pumpModel = new ModelRendererTurbo[6];
		pumpModel[0] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 22
		pumpModel[1] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 34
		pumpModel[2] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 35
		pumpModel[3] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 37
		pumpModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 38
		pumpModel[5] = new ModelRendererTurbo(this, 23, 16, textureX, textureY); // Box 55

		pumpModel[0].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 22
		pumpModel[0].setRotationPoint(5F, -5.5F, -0.5F);

		pumpModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		pumpModel[1].setRotationPoint(11F, -4.5F, -0.5F);

		pumpModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		pumpModel[2].setRotationPoint(11F, -4.5F, -1.5F);

		pumpModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 37
		pumpModel[3].setRotationPoint(11F, -3.5F, -0.5F);

		pumpModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 38
		pumpModel[4].setRotationPoint(11F, -4.5F, 0.5F);

		pumpModel[5].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F, -0.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, -5.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -5.05F, -0.8F, -0.05F, -0.05F, -0.8F, -0.05F); // Box 55
		pumpModel[5].setRotationPoint(11F, -3.25F, -0.5F);



		scopeAttachPoint = new Vector3f(5F /16F, 0F /16F, 0F /16F);

		animationType = EnumAnimationType.SHOTGUN;

                                tiltGunTime = 0.150F;
                                unloadClipTime = 0.0F;
                                loadClipTime = 0.700F;
                                untiltGunTime = 0.150F;
       


		gripIsOnPump = true;


		numBulletsInReloadAnimation = 7F;


		pumpDelayAfterReload = 122;


		pumpDelay = 10;


		pumpTime = 5;


		pumpHandleDistance = 0.2F;


		barrelBreakPoint = new Vector3f(0 /16F, -6F /16F, 15F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}