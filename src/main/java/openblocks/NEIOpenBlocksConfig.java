package openblocks;


public class NEIOpenBlocksConfig implements IConfigureNEI {

	// TODO
	
	@Override
	public void loadConfig() {
//		try {
//			// I have no idea how to link with NEI API
//			Class<?> cls = Class.forName("codechicken.nei.api.API");
//			Method hide = cls.getMethod("hideItem", int.class);
//
//			if (Config.itemHeightMap > 0) hide.invoke(null, Config.itemHeightMap + 256);
//			if (Config.itemTunedCrystalId > 0) hide.invoke(null, Config.itemTunedCrystalId + 256);
//		} catch (Throwable t) {
//			Throwables.propagate(t);
//		}
	}

	@Override
	public String getName() {
		return "OpenBlocks";
	}

	@Override
	public String getVersion() {
		return "@VERSION@";
	}

}
